package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.ProductModelingDetail;
import com.ruoyi.carbon.domain.dto.ProductDetailPageDto;
import com.ruoyi.carbon.domain.dto.ProductMDto;
import com.ruoyi.carbon.domain.vo.ProductDetailVo;
import com.ruoyi.carbon.service.ProductDetailService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.poi.ss.formula.functions.T;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return getDataTable(productList);
    }

    @DeleteMapping("/{id}")
    public AjaxResult DelProductionInfo(@PathVariable Long id){
        return toAjax(productDetailService.delPInfo(id));
    }

    @GetMapping("/{id}")
    public AjaxResult getMaterialByPid(@PathVariable Long id){
        return AjaxResult.success(productDetailService.getMaterialByPid(id));
    }

    @PutMapping
    public AjaxResult updateProductionInfo(@RequestBody ProductMDto productMDto){
        System.out.println(productMDto);
        return toAjax(productDetailService.updateInfo(productMDto));
    }
}
