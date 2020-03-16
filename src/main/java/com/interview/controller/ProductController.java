package com.interview.controller;

import com.interview.bean.ProductBean;
import com.interview.bean.UserBean;
import com.interview.bean.system.RequestResult;
import com.interview.helper.ControllerHelper;
import com.interview.shortcut.ApplicationConfigService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {

    @Autowired
    private ApplicationConfigService acs;

    @ApiOperation(value = "Add product", httpMethod = "POST")
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @RequestMapping(value = "addProduct", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<RequestResult> addProduct(@RequestBody @Valid ProductBean productBean, BindingResult results) {
        if (results.hasErrors()) {
            return ControllerHelper.standardizeValidationFailed(results.getFieldError().getDefaultMessage());
        }
        return ControllerHelper.standardize(acs.productService.addProduct(productBean));
    }

    @ApiOperation(value = "Edit product", httpMethod = "PUT")
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @RequestMapping(value = "editProduct", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<RequestResult> editProduct(@RequestBody @Valid ProductBean productBean, BindingResult results) {
        if (results.hasErrors()) {
            return ControllerHelper.standardizeValidationFailed(results.getFieldError().getDefaultMessage());
        }
        return ControllerHelper.standardize(acs.productService.editProduct(productBean));
    }

    @ApiOperation(value = "Remove product", httpMethod = "DELETE")
    @RequestMapping(value = "removeProduct", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<RequestResult> removeProduct(@RequestParam(value = "List of Product ID")List<Integer> ptIdList) {

        return ControllerHelper.standardize(acs.productService.removeProduct(ptIdList));
    }

    @ApiOperation(value = "Search product", httpMethod = "GET")
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @RequestMapping(value = "searchProduct", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<RequestResult> searchProduct(@RequestParam(value = "Keyword") String keyword) {

        return ControllerHelper.standardize(acs.productService.searchProduct(keyword));
    }

    @ApiOperation(value = "Add product image", httpMethod = "POST")
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @RequestMapping(value = "addProductImage", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<RequestResult> addProductImage(
            @ApiParam(value = "Product ID", required = true) @RequestParam Integer ptId,
            @ApiParam(value = "Image URL", required = true) @RequestParam String imageURL) {

        return ControllerHelper.standardize(acs.productService.addProductImage(ptId, imageURL));
    }

    @ApiOperation(value = "Remove product image", httpMethod = "DELETE")
    @RequestMapping(value = "removeProductImage", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<RequestResult> removeProductImage(@RequestParam(value = "List of Product Image ID")List<Integer> pitIdList) {

        return ControllerHelper.standardize(acs.productService.removeProductImage(pitIdList));
    }

    // TODO: product image

    // TODO: class diagram
}
