package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController {

    @GetMapping
    fun getAll() : CustomerModel {
        return CustomerModel("1","Rodrigo","r@gmail.com")
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int) : CustomerModel {
        return CustomerModel(id.toString(),"Rodrigo","r@gmail.com")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody postCustomerRequest: PostCustomerRequest):  PostCustomerRequest{
        return postCustomerRequest
    }
}