package com.faisal.api.service.implement
import com.faisal.api.entity.Category 
import com.faisal.api.repository.CategoryRepository 
import com.faisal.api.service.CategoryService 
import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.stereotype.Service

@Service 
class CategoryServiceimplement implements CategoryService {
 @Autowired    
 private final CategoryRepository CategoryRepository     
 @Override    
 List<Category>findAll() { 
 CategoryRepository.findAll()           
 }
 @Override    
  Category findById(int id) { 
  CategoryRepository.findById(id)
   }
 }