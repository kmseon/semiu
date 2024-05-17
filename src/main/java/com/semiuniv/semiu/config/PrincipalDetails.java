package com.semiuniv.semiu.config;

import com.semiuniv.semiu.entity.Users;
import org.springframework.security.core.GrantedAuthority;
<<<<<<< HEAD
import org.springframework.security.core.userdetails.User;
=======
>>>>>>> origin/kmseon
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
<<<<<<< HEAD

        return users.getPassword();
=======
        return null;
>>>>>>> origin/kmseon
    }

    @Override
    public String getUsername() {
<<<<<<< HEAD

        return String.valueOf(users.getId());
=======
        return null;
>>>>>>> origin/kmseon
    }

    @Override
    public boolean isAccountNonExpired() {
<<<<<<< HEAD

        return true;
=======
        return false;
>>>>>>> origin/kmseon
    }

    @Override
    public boolean isAccountNonLocked() {
<<<<<<< HEAD

        return true;
=======
        return false;
>>>>>>> origin/kmseon
    }

    @Override
    public boolean isCredentialsNonExpired() {
<<<<<<< HEAD

        return true;
=======
        return false;
>>>>>>> origin/kmseon
    }

    @Override
    public boolean isEnabled() {
<<<<<<< HEAD

        return true;
=======
        return false;
>>>>>>> origin/kmseon
    }
}
