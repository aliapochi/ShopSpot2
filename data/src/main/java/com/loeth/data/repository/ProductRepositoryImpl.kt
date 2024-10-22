package com.loeth.data.repository

import com.loeth.domain.model.Product
import com.loeth.domain.network.NetworkService
import com.loeth.domain.network.ResultWrapper
import com.loeth.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService): ProductRepository {
    override suspend fun getProduct(): ResultWrapper<List<Product>> {
        return networkService.getProducts()
    }
}