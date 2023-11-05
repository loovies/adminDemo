package com.ruoyi.web.controller.carbon;

import com.ruoyi.carbon.domain.BOMData;
import com.ruoyi.carbon.domain.vo.BOMDataVo;
import com.ruoyi.carbon.service.BOMDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/bom")
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
}
