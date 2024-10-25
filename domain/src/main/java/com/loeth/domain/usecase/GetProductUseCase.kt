package com.loeth.domain.usecase

import com.loeth.domain.repository.ProductRepository

class GetProductUseCase(private val repository: ProductRepository) {
    suspend fun execute(category: String?) = repository.getProduct(category)
}