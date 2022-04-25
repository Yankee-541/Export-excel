package com.example.jwt_springboot_tuyen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentExportExcelModel extends BaseExportExcelModel {
    private Long id;
    private String username;
    private String email;
    @Override
    public List<MetadataExcelModel> getListMetadata() {
        return Arrays.asList(
                new MetadataExcelModel(1, "id", Long.class, "Mã học sinh"),
                new MetadataExcelModel(2, "username", String.class, "Tên học sinh"),
                new MetadataExcelModel(3, "email", String.class, "Lớp")
        );
    }
}
