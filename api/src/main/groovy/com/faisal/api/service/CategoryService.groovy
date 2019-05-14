package com.faisal.api.service
import com.faisal.api.entity.Category

interface CategoryService { 
    List<Category>findAll()   
    Category findById(int id)
     }