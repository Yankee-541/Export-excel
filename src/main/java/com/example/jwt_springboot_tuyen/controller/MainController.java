package com.example.jwt_springboot_tuyen.controller;

import com.example.jwt_springboot_tuyen.entity.BaseExportExcelModel;
import com.example.jwt_springboot_tuyen.entity.MetadataExcelModel;
import com.example.jwt_springboot_tuyen.entity.StudentExportExcelModel;
import com.example.jwt_springboot_tuyen.entity.User;
import com.example.jwt_springboot_tuyen.service.ExportExcelFileService;
import com.example.jwt_springboot_tuyen.service.ExportXLSXFileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/example/export")
@AllArgsConstructor
public class MainController {
    private final ExportXLSXFileService exportExcelFileService;

    @GetMapping
    public void exportExcel(HttpServletResponse http) throws IOException{
        List<BaseExportExcelModel> list = new ArrayList<>();
        list.add(new StudentExportExcelModel(
                2L, "a", "c"
        ));
        exportExcelFileService.exportFile("test","dang",list ,StudentExportExcelModel.class);

    }


}
