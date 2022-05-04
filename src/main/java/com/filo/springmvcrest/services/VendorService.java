package com.filo.springmvcrest.services;

import com.filo.springmvcrest.api.model.VendorDTO;
import com.filo.springmvcrest.api.model.VendorListDTO;

/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/
public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
