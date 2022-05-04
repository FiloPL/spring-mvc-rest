package com.filo.springmvcrest.api.mapper;

import com.filo.springmvcrest.api.model.VendorDTO;
import com.filo.springmvcrest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * Created by T. Filo Zegarlicki on 04.05.2022
 **/

@Mapper
public interface VendorMapper {
    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);
    VendorDTO vendorToVendorDTO(Vendor vendor);
    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
