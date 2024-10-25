package com.loeth.domain.repository

import com.loeth.domain.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<List<String>>
}
