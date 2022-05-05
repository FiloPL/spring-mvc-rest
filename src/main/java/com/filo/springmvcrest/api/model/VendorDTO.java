package com.filo.springmvcrest.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

    @ApiModelProperty(value = "Name of the Vendor", required = true)
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}
