package com.ruoyi.carbon.service.impl;

import com.ruoyi.carbon.domain.ProductModeling;
import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductAddDto;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.dto.ProductMDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;
import com.ruoyi.carbon.mapper.ProductDetailMapper;
import com.ruoyi.carbon.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    private ProductDetailMapper productDetailMapper;
//    @Override
//    public List<ProductModelingDetail> getProductList(ProductDetailPageDto pageDto) {
//        return productDetailMapper.getProductList(pageDto);
//    }
    @Override
    public List<ProductDetailVo> getProductList(ProductDetailPageDto pageDto) {
        return productDetailMapper.getProductList(pageDto);
    }

    @Override
    public int delPInfo(Long id) {
        int pd = productDetailMapper.delPdetailInfo(id);
        int p = productDetailMapper.delPInfo(id);
        return pd+p > 1 ? 1 : 0;
    }

    @Override
    public ProductDetailVo getMaterialByPid(Long id) {
        return productDetailMapper.getMaterialByPid(id);
    }

    @Override
    public int updateInfo(ProductMDto productMDto) {
        int p = productDetailMapper.updateproduct(productMDto);
        int m = productDetailMapper.updateM(productMDto);
        return p+m > 1 ? 1: 0;
    }

    @Override
    public int addProuctInfo(ProductAddDto productAddDto) {

        Long pid = Long.parseLong(Long.toString(System.currentTimeMillis()).substring(1,5));

        ProductModeling pm = new ProductModeling();
        pm.setPid(pid);
        pm.setProduct(productAddDto.getProduct());
        pm.setModelName(productAddDto.getModelName());
        pm.setRemark(pm.getRemark());
        pm.setProductUnit("个");
        pm.setCreateTime(LocalDateTime.now());
        pm.setUpdateTime(LocalDateTime.now());
        pm.setIsDeleteId(0);

        int p = productDetailMapper.addPInfo(pm);

        if(productAddDto.getMid() == -1){
            productAddDto.setMid(null);
        }

        ProductModelingDetail pmd = new ProductModelingDetail();
        pmd.setId(System.currentTimeMillis());
        pmd.setMid(productAddDto.getMid());
        pmd.setCreateTime(LocalDateTime.now());
        pmd.setPid(pid);
        pmd.setUpdateTime(LocalDateTime.now());
        pmd.setIsDeleteId(0);

        int pms = productDetailMapper.addPDInfo(pmd);
        return p+pms > 1 ? 1:0;
    }
}
