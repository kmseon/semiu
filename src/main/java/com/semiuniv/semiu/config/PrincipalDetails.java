package com.semiuniv.semiu.config;

import com.semiuniv.semiu.entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {
    private Users users;
    public PrincipalDetails(Users users){
        this.users=users;
    }
    public Users getUsers(){
        return users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(() -> {
            return users.getRole().toString();});
        return collect;
    }

    @Override
    public String getPassword() {

        return users.getPassword();
    }

    @Override
    public String getUsername() {

        return String.valueOf(users.getId());
    }

    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return true;
    }

    @Override
    public boolean isEnabled() {

        return true;
    }
}
