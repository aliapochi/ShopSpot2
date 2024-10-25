package com.loeth.domain.usecase

import com.loeth.domain.repository.CategoryRepository


class GetCategoriesUseCase (private val repository: CategoryRepository) {
    suspend fun execute() = repository.getCategories()
}