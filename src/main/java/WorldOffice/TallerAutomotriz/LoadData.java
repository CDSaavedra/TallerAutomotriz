package WorldOffice.TallerAutomotriz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import WorldOffice.TallerAutomotriz.Interfaces.IhistoricoRepService;
import WorldOffice.TallerAutomotriz.Models.Cliente;
import WorldOffice.TallerAutomotriz.Models.RegVehiculo;
import WorldOffice.TallerAutomotriz.Models.Vehiculo;
import WorldOffice.TallerAutomotriz.Models.Auth.Role;
import WorldOffice.TallerAutomotriz.Models.Auth.User;
import WorldOffice.TallerAutomotriz.Repositories.RoleRepository;
import WorldOffice.TallerAutomotriz.Repositories.UserRepository;
import WorldOffice.TallerAutomotriz.Services.ClienteService;
import WorldOffice.TallerAutomotriz.Services.RegVehiculoService;
import WorldOffice.TallerAutomotriz.Services.VehiculoService;
import WorldOffice.TallerAutomotriz.Models.HistoricoRep;
@Configuration
public class LoadData {

	@Bean
	CommandLineRunner initDatabase(UserRepository userRepository, RoleRepository roleRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		return args -> {
			
			Role adminRole = new Role();
			adminRole.setName("ADMIN");
			roleRepository.save(adminRole);
			
			Role viewerRole = new Role();
			viewerRole.setName("VIEWER");
			roleRepository.save(viewerRole);
			
			Role customerRole = new Role();
			customerRole.setName("CUSTOMER");
			roleRepository.save(customerRole);

			User admin = new User();
			admin.setUsername("admin");
			admin.setPassword(bCryptPasswordEncoder.encode("12345"));
			admin.setRol(adminRole);
			userRepository.save(admin);
			
			User visitor = new User();
			visitor.setUsername("visitor");
			visitor.setPassword(bCryptPasswordEncoder.encode("12345"));
			visitor.setRol(viewerRole);
			userRepository.save(visitor);
			
			User customer = new User();
			customer.setUsername("customer");
			customer.setPassword(bCryptPasswordEncoder.encode("12345"));
			customer.setRol(customerRole);
			userRepository.save(customer);
		};
	}	
	
@Bean
CommandLineRunner clientes(ClienteService clienteService) {
    return arg -> {
     
    	Cliente cliente = new Cliente();
    	cliente.setNombre("pepe");
    	cliente.setApellido("Garzon");
    	cliente.setCedula((long) 1010201);
    	cliente.setEdad((long) 10);
    	cliente.setFecharegisto("10/12/2001");
    	cliente.setTelefono((int) 3132110);
        
        
        
    	clienteService.save(cliente);
        
    	Cliente cliente1 = new Cliente();
    	cliente1.setNombre("paco");
    	cliente1.setApellido("malgesto");
    	cliente1.setCedula((long) 23124325);
    	cliente1.setEdad((long) 24);
    	cliente1.setFecharegisto("11/1/2002");
    	cliente1.setTelefono((int) 12312432);
       
        
    	clienteService.save(cliente1);
   
};

}	

@Bean
CommandLineRunner vehiculos(VehiculoService vehiculoService) {
    return arg -> {
     
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipovehiculo("Moto");
        vehiculo.setPlaca("MXD34D");
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Cbr160");
        vehiculo.setColor("Rojo");
        
        
        
        
       vehiculoService.save(vehiculo);
        
        
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setTipovehiculo("moto");
        vehiculo1.setPlaca("DSD23D");
        vehiculo1.setMarca("Susuki");
        vehiculo1.setModelo("GSX150");
        vehiculo1.setColor("Negro");
        
     vehiculoService.save(vehiculo1);
   
};

}

@Bean
CommandLineRunner RegVehiculos(RegVehiculoService regVehiculoService) {
    return arg -> {
     
    	RegVehiculo regVehiculo = new RegVehiculo();
    	regVehiculo.setSoat(true);
    	regVehiculo.setTecnactiva(true);
    	regVehiculo.setSeguroact(true);
    	regVehiculo.setMultaspendientes((long) 1);
    	
        
        
       
    	regVehiculoService.crearRegistroV(regVehiculo);
        
        
    	RegVehiculo regVehiculo1 = new RegVehiculo();
    	regVehiculo1.setSoat(false);
    	regVehiculo1.setTecnactiva(true);
    	regVehiculo1.setMultaspendientes((long) 4);
    	regVehiculo1.setSeguroact(false);
    	regVehiculoService.crearRegistroV(regVehiculo1);
   
};
}


@Bean
CommandLineRunner HistoricoRep(IhistoricoRepService historicoRepService) {
    return arg -> {
     
    	HistoricoRep historicoRep = new HistoricoRep();
    	historicoRep.setNombremecanico("Camilo");
    	historicoRep.setCantreparaciones("2");
    	historicoRep.setCantrepuestos("1");
    	historicoRep.setUltimareparacion("23/12/2018");
    	
        historicoRepService.save(historicoRep);
        
        HistoricoRep historicoRep1 = new HistoricoRep();
        historicoRep1.setNombremecanico("Daniel");
        historicoRep1.setCantreparaciones("3");
        historicoRep1.setCantrepuestos("7");
        historicoRep1.setUltimareparacion("24/11/2019");
    	
        historicoRepService.save(historicoRep1);
        
    
};		
}

}

