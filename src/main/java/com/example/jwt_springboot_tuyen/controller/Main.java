package com.example.jwt_springboot_tuyen.controller;

import com.example.jwt_springboot_tuyen.entity.BaseExportExcelModel;
import com.example.jwt_springboot_tuyen.entity.StudentExportExcelModel;
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

public class Main {
    public static void main(String[] args) {
        ExportExcelFileService exportExcelFileService = new ExportXLSXFileService();
        List<BaseExportExcelModel> list = new ArrayList<>();
        list.add(new StudentExportExcelModel(
                2L, "a", "c"
        ));
        exportExcelFileService.exportFile("test","dang",list ,StudentExportExcelModel.class);
    }
}
