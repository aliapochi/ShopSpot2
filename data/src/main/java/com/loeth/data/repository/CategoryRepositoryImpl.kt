package com.loeth.data.repository

import com.loeth.domain.network.NetworkService
import com.loeth.domain.network.ResultWrapper
import com.loeth.domain.repository.CategoryRepository

class CategoryRepositoryImpl(val networkService: NetworkService): CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<List<String>> {
       return networkService.getCategories()
    }
}