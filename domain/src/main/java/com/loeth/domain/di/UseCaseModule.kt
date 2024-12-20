package com.loeth.domain.di

import com.loeth.domain.usecase.GetCategoriesUseCase
import com.loeth.domain.usecase.GetProductUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetProductUseCase(get())}
    factory { GetCategoriesUseCase(get()) }
}