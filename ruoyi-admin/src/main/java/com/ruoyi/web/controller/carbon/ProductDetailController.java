package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;
import com.ruoyi.carbon.service.ProductDetailService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/productModeling")
public class ProductDetailController extends BaseController {

    @Autowired
    private ProductDetailService productDetailService;

    @GetMapping("/list")
    public TableDataInfo getProductList(ProductDetailPageDto pageDto){
        startPage();
        List<ProductDetailVo> productList = productDetailService.getProductList(pageDto);
        System.out.println("++");
        System.out.println(productList);
        return getDataTable(productList);
    }
}
