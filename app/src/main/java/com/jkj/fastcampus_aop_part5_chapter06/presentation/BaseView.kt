package com.jkj.fastcampus_aop_part5_chapter06.presentation

interface BaseView<PresenterT: BasePresenter> {

    val presenter: PresenterT
}