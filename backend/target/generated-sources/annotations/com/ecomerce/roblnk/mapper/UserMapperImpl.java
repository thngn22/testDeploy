package com.ecomerce.roblnk.mapper;

import com.ecomerce.roblnk.dto.user.AddressDTO;
import com.ecomerce.roblnk.dto.user.UserAddressRequest;
import com.ecomerce.roblnk.dto.user.UserAddressResponse;
import com.ecomerce.roblnk.dto.user.UserDetailResponse;
import com.ecomerce.roblnk.dto.user.UserProfileResponse;
import com.ecomerce.roblnk.dto.user.UserResponse;
import com.ecomerce.roblnk.model.Address;
import com.ecomerce.roblnk.model.Role;
import com.ecomerce.roblnk.model.User;
import com.ecomerce.roblnk.model.UserAddress;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-15T14:02:20+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserProfileResponse toUserProfileResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserProfileResponse userProfileResponse = new UserProfileResponse();

        userProfileResponse.setEmail( user.getEmail() );
        userProfileResponse.setFirstName( user.getFirstName() );
        userProfileResponse.setLastName( user.getLastName() );
        userProfileResponse.setPhone( user.getPhone() );
        userProfileResponse.setEmailActive( user.isEmailActive() );
        userProfileResponse.setPhoneActive( user.isPhoneActive() );
        userProfileResponse.setAvatar( user.getAvatar() );

        return userProfileResponse;
    }

    @Override
    public UserDetailResponse toUserDetailResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserDetailResponse userDetailResponse = new UserDetailResponse();

        userDetailResponse.setEmailActive( user.isEmailActive() );
        userDetailResponse.setPhoneActive( user.isPhoneActive() );
        userDetailResponse.setActive( user.isActive() );
        userDetailResponse.setId( user.getId() );
        userDetailResponse.setEmail( user.getEmail() );
        userDetailResponse.setFirstName( user.getFirstName() );
        userDetailResponse.setLastName( user.getLastName() );
        userDetailResponse.setPhone( user.getPhone() );
        userDetailResponse.setDob( user.getDob() );
        userDetailResponse.setGender( user.getGender() );
        userDetailResponse.setAvatar( user.getAvatar() );
        userDetailResponse.setCreatedAt( user.getCreatedAt() );
        Set<Role> set = user.getRoles();
        if ( set != null ) {
            userDetailResponse.setRoles( new LinkedHashSet<Role>( set ) );
        }

        return userDetailResponse;
    }

    @Override
    public UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( user.getId() );
        userResponse.setEmail( user.getEmail() );
        userResponse.setEmailActive( user.isEmailActive() );
        userResponse.setActive( user.isActive() );
        userResponse.setPhone( user.getPhone() );

        return userResponse;
    }

    @Override
    public List<UserResponse> toListUserResponse(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( userList.size() );
        for ( User user : userList ) {
            list.add( toUserResponse( user ) );
        }

        return list;
    }

    @Override
    public UserAddressResponse toUserAddressResponse(UserAddress userAddress) {
        if ( userAddress == null ) {
            return null;
        }

        UserAddressResponse userAddressResponse = new UserAddressResponse();

        userAddressResponse.setDefault( userAddress.isDefault() );
        userAddressResponse.setAddress( toUserAddressDTO( userAddress.getAddress() ) );

        return userAddressResponse;
    }

    @Override
    public List<UserAddressResponse> toListUserAddressResponse(List<UserAddress> userAddresses) {
        if ( userAddresses == null ) {
            return null;
        }

        List<UserAddressResponse> list = new ArrayList<UserAddressResponse>( userAddresses.size() );
        for ( UserAddress userAddress : userAddresses ) {
            list.add( toUserAddressResponse( userAddress ) );
        }

        return list;
    }

    @Override
    public AddressDTO toUserAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setStreetAddress( address.getStreetAddress() );
        addressDTO.setZipCode( address.getZipCode() );

        return addressDTO;
    }

    @Override
    public Address toAddressEntity(UserAddressRequest userAddressRequest) {
        if ( userAddressRequest == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreetAddress( userAddressRequest.getStreetAddress() );
        address.setCity( userAddressRequest.getCity() );
        address.setZipCode( userAddressRequest.getZipCode() );

        return address;
    }
}
