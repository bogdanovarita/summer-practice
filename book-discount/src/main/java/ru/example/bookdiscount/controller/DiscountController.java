package ru.example.bookdiscount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.bookdiscount.dto.DiscountDto;
import ru.example.bookdiscount.facade.DiscountFacade;

import java.util.List;

@RestController
@RequestMapping(value = "/discount", produces = "application/json")
public class DiscountController {
    private final DiscountFacade discountFacade;

    @Autowired
    public DiscountController(DiscountFacade discountFacade) {
        this.discountFacade = discountFacade;
    }

    @GetMapping
    public ResponseEntity<Integer> getDiscount() {
        return new ResponseEntity<>(20, HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<DiscountDto> getAllDiscounts() {
        return discountFacade.getAllDiscounts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDiscount(@RequestBody DiscountDto discountDto) {
        discountFacade.create(discountDto);
    }

}
