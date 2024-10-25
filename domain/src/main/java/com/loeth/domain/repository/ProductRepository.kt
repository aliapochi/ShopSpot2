package com.loeth.domain.repository

import com.loeth.domain.model.Product
import com.loeth.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProduct(category: String?): ResultWrapper<List<Product>>
}