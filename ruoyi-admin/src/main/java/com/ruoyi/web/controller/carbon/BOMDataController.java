package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.dto.BOMupdateDataDto;
import com.ruoyi.carbon.domain.dto.BomDataDto;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.domain.vo.ProductModelVo;
import com.ruoyi.carbon.domain.vo.ProductTypeVo;
import com.ruoyi.carbon.domain.vo.UpdateMidVo;
import com.ruoyi.carbon.service.BOMDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/bom")
public class BOMDataController extends BaseController {

    @Autowired
    private BOMDataService bomDataService;

    @GetMapping("/list")
    public TableDataInfo getBOMData(String bname){
        startPage();
        List<BOMDataVo> list = bomDataService.getBOMData(bname);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult getBOMDataById(@PathVariable Long id){

        BOMData n = bomDataService.getBOMDataById(id);
        return AjaxResult.success(n);
    }

    @GetMapping("/bomModel")
    public TableDataInfo getBomModel(){
        List<ProductModelVo> list = bomDataService.getProductModel();
        return getDataTable(list);
    }

    @PutMapping("/updatebom")
    public AjaxResult updateBom(@RequestBody BOMupdateDataDto boMupdateDataDto){
        int n = bomDataService.updateBOM(boMupdateDataDto);
        return toAjax(n);
    }

    @PutMapping("/updatebomdId")
    public AjaxResult updateBOMById(@RequestBody UpdateMidVo updateMidVo){
        System.out.println("+++++++++++++");
        System.out.println("+++++++++++++");
        System.out.println("+++++++++++++");
        System.out.println("+++++++++++++");
        System.out.println(updateMidVo);
        int n = bomDataService.updateBOMById(updateMidVo);
        return toAjax(n);
    }

    @PostMapping("/addbomdetail")
    public AjaxResult addBOMDetail(Long bid,Long mid ){
        int n = bomDataService.addBOMData(bid,mid);
        return toAjax(n);
    }

    @GetMapping("/getproductType")
    public TableDataInfo getProductType(){
        List<ProductTypeVo> list = bomDataService.getProductType();
        return getDataTable(list);
    }
    @PostMapping("/addbom")
    public AjaxResult addBOM(@RequestBody BomDataDto bomDataDto){
        int n = bomDataService.addBOM(bomDataDto);
        return toAjax(n);
    }
}
