package com.mercadolivro.service

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@Service
class CustomerService {

    fun getAll() : CustomerModel {
        return CustomerModel("1","Rodrigo","r@gmail.com")
    }

    fun getCustomer(id: Int) : CustomerModel {
        return CustomerModel(id.toString(),"Rodrigo","r@gmail.com")
    }

    fun create(postCustomerRequest: PostCustomerRequest): PostCustomerRequest {
        return postCustomerRequest
    }

    fun update(id: Int,putCustomerRequest: PutCustomerRequest){
        println(putCustomerRequest)
    }

    fun delete(id: Int){
        println("Delete id: $id")
    }
}