package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAll() : CustomerModel {
       return customerService.getAll()
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int) : CustomerModel {
        return customerService.getCustomer(id)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody postCustomerRequest: PostCustomerRequest):  PostCustomerRequest{
        return customerService.create(postCustomerRequest)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody putCustomerRequest: PutCustomerRequest){
        customerService.update(id,putCustomerRequest)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int){
        customerService.delete(id)
    }
}