package com.loeth.data.di

import com.loeth.data.repository.CategoryRepositoryImpl
import com.loeth.data.repository.ProductRepositoryImpl
import com.loeth.domain.repository.CategoryRepository
import com.loeth.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
}