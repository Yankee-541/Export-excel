package com.example.jwt_springboot_tuyen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MetadataExcelModel {
    private int position;
    private String fieldName;
    private Class<?> parameterType;
    private String header;
}
