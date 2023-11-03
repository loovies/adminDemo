package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.Material;
import com.ruoyi.carbon.domain.MaterialCategory;
import com.ruoyi.carbon.domain.vo.MaterialVo;
import com.ruoyi.carbon.service.MaterialService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/material")
public class MaterialController extends BaseController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public TableDataInfo getAllInfo(Long id ,Long mid){
        List<MaterialVo> materialList = materialService.getAll(id,mid);
        return getDataTable(materialList);
    }

     @GetMapping("/category")
    public TableDataInfo getCategoryInfo(){
        List<MaterialCategory> list= materialService.getCategoryInfo();
        return getDataTable(list);
    }
}
