package com.loeth.data.di

import com.loeth.data.repository.ProductRepositoryImpl
import com.loeth.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}