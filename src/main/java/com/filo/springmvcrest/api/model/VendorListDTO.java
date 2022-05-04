package com.filo.springmvcrest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorListDTO {

    List<VendorDTO> vendors;
}
