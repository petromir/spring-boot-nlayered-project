package com.petromirdzhunev.entity;

import lombok.Builder;
import lombok.Data;

// FIXME: This will be autogenerated from JOOQ
@Data
@Builder
public class Category {
	private Long id;
	private String name;
	private String description;
	private Long parentId;
}