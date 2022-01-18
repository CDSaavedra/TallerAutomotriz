package WorldOffice.TallerAutomotriz.Services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import WorldOffice.TallerAutomotriz.Models.Auth.User;
import WorldOffice.TallerAutomotriz.Repositories.UserRepository;


@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {
	private UserRepository usuarioRepository;

	public UsuarioDetailsServiceImpl(UserRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User usuario = usuarioRepository.findByUsername(username);

		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		
		List<SimpleGrantedAuthority> roles = getRoles(usuario);

		return new org.springframework.security.core.userdetails.User
				(usuario.getUsername(), usuario.getPassword(), roles);
	}

	private List<SimpleGrantedAuthority> getRoles(User usuario) {
		List<SimpleGrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority(usuario.getRol().getName()));
		
		return roles;
	}
}
