/**
 * 
 */
package edu.unah.poo.controller;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import edu.unah.poo.model.Distribuye;
import edu.unah.poo.model.Empleado;
import edu.unah.poo.model.IdDistribuye;
import edu.unah.poo.model.IdRealiza;
import edu.unah.poo.model.InventarioPeces;
import edu.unah.poo.model.Limpieza;
import edu.unah.poo.model.Lote;
import edu.unah.poo.model.Producto;
import edu.unah.poo.model.ProductoEnlatado;
import edu.unah.poo.model.Proveedor;
import edu.unah.poo.model.Realiza;
import edu.unah.poo.model.Ventas;
import edu.unah.poo.service.ServiceDistribuye;
import edu.unah.poo.service.ServiceEmpleado;
import edu.unah.poo.service.ServiceInventarioPeces;
import edu.unah.poo.service.ServiceLimpieza;
import edu.unah.poo.service.ServiceLote;
import edu.unah.poo.service.ServiceProducto;
import edu.unah.poo.service.ServiceProductoEnlatado;
import edu.unah.poo.service.ServiceProveedor;
import edu.unah.poo.service.ServiceRealiza;
import edu.unah.poo.service.ServiceVentas;

/**
 * @author Tiffany
 *
 */
@RestController
public class Controller {
	@Autowired
	ServiceDistribuye serviceDistribuye;
	@Autowired
	ServiceEmpleado serviceEmpleado;
	@Autowired
	ServiceInventarioPeces serviceInventarioPeces;
	@Autowired 
	ServiceLimpieza serviceLimpieza;
	@Autowired
	ServiceLote serviceLote;
	@Autowired
	ServiceProducto serviceProducto;
	@Autowired
	ServiceProductoEnlatado serviceproductoEnlatado;
	@Autowired
	ServiceProveedor serviceProveedor;
	@Autowired
	ServiceRealiza serviceRealiza;
	@Autowired
	ServiceVentas serviceVentas;
	
	
	
	//=======================================
	//Inventario Peces.
	//=======================================
	
	@RequestMapping(value = "/inventarioPeces/crearInventarioPeces",
								method = RequestMethod.GET)
	public InventarioPeces crearInventarioPeces(@RequestParam(name ="id") int id,
												@RequestParam(name = "nombre") String nombre,
												@RequestParam(name = "color")String color,
												@RequestParam(name ="tipoAgua")String tipoAgua,
												@RequestParam(name = "tamanioPromedio") String tamanioPromedio) {
	
	//int id, String nombre, String color, String tipoAgua, String tamanioPromedio
	InventarioPeces inventarioPez = new InventarioPeces(id , nombre, color, tipoAgua, tamanioPromedio);
			this.serviceInventarioPeces.crearInventarioPeces(inventarioPez);
			return inventarioPez;
			
	}
		@RequestMapping (value ="/inventarioPeces/listaInventarioPeces",
							method=RequestMethod.GET)
		public List<InventarioPeces> listadoInventarioPeces(){
			return this.serviceInventarioPeces.obtenerTodosInventarioPeces();
		}
	
			
		@RequestMapping (value ="/inventarioPeces/buscarInventarioPeces",
				method = RequestMethod.GET)
		public InventarioPeces buscarInventarioPeces(@RequestParam(name ="id")int id) {
			return this.serviceInventarioPeces.buscarInventario(id);
			
		}
		
		//===============================================================
		//Proveedor
		//===============================================================
		
		//int idProveedor, String nombre, String telefono
		
		@RequestMapping (value ="/proveedor/crearProveedor",
							method=RequestMethod.GET)
		public Proveedor crearProveedor(@RequestParam(name ="idProveedor") int idProveedor,
									   @RequestParam(name = "nombre")String nombre,
									   @RequestParam(name = "telefono") String telefono) {
			
			Proveedor proveedor = new Proveedor (idProveedor, nombre, telefono);
			this.serviceProveedor.crearProveedor(proveedor);
			return proveedor;
			
			
		}
		
		@RequestMapping (value ="/proveedor/listaProveedores",
				method=RequestMethod.GET)
		public List<Proveedor> listaProveedores(){
		return this.serviceProveedor.obtenerProveedores();
}
	@RequestMapping (value ="/proveedor/buscarProveedor",
			method =RequestMethod.GET)
	public Proveedor buscarProveedor(@RequestParam (name ="idProveedor") int idProveedor) {
		return this.serviceProveedor.buscarProveedor(idProveedor);
	}
		
	
	//================================================
	//Producto
	//================================================
	
	//int idProducto, int indiceCalidad, double pesoGlobal, double precioxK, Lote numLote,
	//InventarioPeces productoInventario
	
	@RequestMapping (value = "/producto/crearProducto",method=RequestMethod.GET)
	public Producto crearProducto(@RequestParam(name = "id") int idProducto,
			                 @RequestParam(name = "indiceCalidad") int indiceCalidad,
			                 @RequestParam(name = "pesoGlobal") double pesoGlobal,
			                 @RequestParam(name = "precioxK") double precioxK,
			                 @RequestParam(name= "numLote" )int numLote,
			                 @RequestParam(name="productoInventario") int productoInventario) {
		
		Lote lote = this.serviceLote.buscarLote(numLote);
		InventarioPeces pInventario = this.serviceInventarioPeces.buscarInventario(productoInventario);
		Producto tmpProducto = new Producto(idProducto,indiceCalidad, pesoGlobal, 
											precioxK, lote, pInventario);
		
		this.serviceProducto.crearProducto(tmpProducto);
		return tmpProducto;	
	}
	@RequestMapping(value = "/producto/listarProducto",method=RequestMethod.GET)
	public List<Producto> listarProducto(){
		return this.serviceProducto.obtenerProductos();
	
	}
	
	@RequestMapping(value ="/producto/buscarProducto",method=RequestMethod.GET)
	public Producto buscarProducto(@RequestParam(name = "id") int idProducto) {
		return this.serviceProducto.buscarProducto(idProducto);
	}
	
	
	//===========================================================
	//Distribuye
	//===========================================================
	
	@RequestMapping (value = "/distribuye/crearDistribucion",method=RequestMethod.GET)
	public Distribuye crearDistribucion(@RequestParam(name = "idProducto") int idProducto,
			                      @RequestParam(name = "idProveedor") int idProveedor,
			                      @RequestParam(name = "fecha") @DateTimeFormat(iso = ISO.DATE)  LocalDate fecha) {
			                      
		
		Producto p = this.serviceProducto.buscarProducto(idProducto);
		Proveedor pro = this.serviceProveedor.buscarProveedor(idProveedor);
		
		
		Distribuye tmpDistribuye = new Distribuye(idProducto, idProveedor, fecha, p, pro);
		this.serviceDistribuye.crearDistribucion(tmpDistribuye);
		return tmpDistribuye;
	}

	@RequestMapping(value = "/distribuye/buscarDistribucion",method=RequestMethod.GET)
	public Distribuye buscarRevision(@RequestParam(name = "idProveedor") int idProveedor,
					                @RequestParam(name = "idProducto") int idProducto,
					                @RequestParam(name = "fecha") @DateTimeFormat(iso = ISO.DATE)  LocalDate fecha
					                ){
		IdDistribuye idDistribuye = new IdDistribuye(idProveedor, idProducto, fecha);
		return this.serviceDistribuye.buscarDistribucion(idDistribuye);
	}
	
	@RequestMapping(value = "/distribuye/listarDistribucion",method=RequestMethod.GET)
	public List<Distribuye> listarDistribucion(){
		return this.serviceDistribuye.obtenerTodasDistribucion();
	}
	
	
	//********************************************************************************
	//Realiza
	//*********************************************************************************
	
	
	@RequestMapping (value = "/realiza/crearRealiza",method=RequestMethod.GET)
	public Realiza crearRealiza(@RequestParam(name = "idLimpieza") int idLimpieza,
			                      @RequestParam(name = "idEmpleado") int idEmpleado,
			                      @RequestParam(name = "fecha") @DateTimeFormat(iso = ISO.DATE)  LocalDate fecha,
			                      @RequestParam(name= "horaInicio")String horaInicio,
			                      @RequestParam(name = "horaFinal") String horaFinal) {
			                      
		
		Limpieza lim = this.serviceLimpieza.buscarLimpieza(idLimpieza);
		Empleado empl = this.serviceEmpleado.buscarEmpleado(idEmpleado);
		
		
		Realiza tmpRealiza = new Realiza(idLimpieza, idEmpleado, fecha,horaInicio, horaFinal, lim, empl);
		this.serviceRealiza.crearRealiza(tmpRealiza);
		return tmpRealiza;
	}

	@RequestMapping (value = "/realiza/buscarRealiza",method=RequestMethod.GET)
	public Realiza buscarRealiza(@RequestParam(name = "idLimpieza") int idLimpieza,
			                      @RequestParam(name = "idEmpleado") int idEmpleado,
			                      @RequestParam(name = "fecha") @DateTimeFormat(iso = ISO.DATE)  LocalDate fecha,
			                      @RequestParam(name= "horaInicio")String horaInicio,
			                      @RequestParam(name = "horaFinal") String horaFinal) {
			                      
	
					                
	IdRealiza idRealiza = new IdRealiza(idLimpieza, idEmpleado, fecha);
	return this.serviceRealiza.buscarRealiza(idRealiza);
	}
	
	@RequestMapping(value = "/realiza/listarRealiza",method=RequestMethod.GET)
	public List<Distribuye> listarRealiza(){
		return this.serviceDistribuye.obtenerTodasDistribucion();
	}
	
	//***************************************************************************
	//Empleado
	//***************************************************************************
	
	//int idEmpleado, String nombre, String telefono, String direccion, 
	//Date fechaContrato, Date fechaNac,
	//String puesto
	
	@RequestMapping (value = "/empleado/crearEmpleado",method=RequestMethod.GET)
	public Empleado crearEmpleado(@RequestParam(name = "idEmpleado") int idEmpleado,
			                 @RequestParam(name = "nombre") String nombre,
			                 @RequestParam(name = "telefono") String telefono,
			                 @RequestParam(name = "direccion") String direccion,
			                 @RequestParam(name= "fechaContrato" ) @DateTimeFormat(iso = ISO.DATE)  LocalDate fechaContrato,
			                 @RequestParam(name="fechaNac") @DateTimeFormat(iso = ISO.DATE)  LocalDate fechaNac,
			                 @RequestParam(name = "puesto")String puesto) {
		

		Empleado tmpEmpleado = new Empleado(idEmpleado,nombre, telefono, 
											direccion, fechaContrato, fechaNac, puesto);
		this.serviceEmpleado.crearEmpleado(tmpEmpleado);
		return tmpEmpleado;	
	}
	@RequestMapping(value = "/empleado/listarEmpleado",method=RequestMethod.GET)
	public List<Empleado> listarEmpleado(){
		return this.serviceEmpleado.obtenerEmpledos();	
	}
	
	@RequestMapping(value ="/empleado/buscarEmpleado",method=RequestMethod.GET)
	public Empleado buscarEmpleado(@RequestParam(name = "id") int idEmpleado) {
		return this.serviceEmpleado.buscarEmpleado(idEmpleado);
	}
	
	//*****************************************************
	//Limpieza
	//*****************************************************
	
	//int idLimpieza, int nLotesALimpiar, int empleadosAsig, int numEnlatados, 
	//Empleado idEncargado,
	//Lote lote
	
	

	@RequestMapping (value = "/limpieza/crearLimpieza",method=RequestMethod.GET)
	public Limpieza crearLimpieza(@RequestParam(name = "idLimpieza") int idLimpieza,
			                 @RequestParam(name = "nLotesALimpiar") int nLotesALimpiar,
			                 @RequestParam(name = "empleadosAsig") int empleadosAsig,
			                 @RequestParam(name = "numEnlatados") int numEnlatados,
			                 @RequestParam(name= "idEmpleado" ) int idEncargado,
			                 @RequestParam(name="lote") int idlote
			  					) {
		
		Lote lot = this.serviceLote.buscarLote(idlote);
		Empleado e= this.serviceEmpleado.buscarEmpleado(idEncargado);
		Limpieza tmpLimpieza = new Limpieza(idLimpieza,nLotesALimpiar, empleadosAsig, 
											numEnlatados, e, lot);
		this.serviceLimpieza.crearLimpieza(tmpLimpieza);
		return tmpLimpieza;	
	}
	@RequestMapping(value = "/limpieza/listarLimpiezas",method=RequestMethod.GET)
	public List<Limpieza> listarLimpiezas(){
		return this.serviceLimpieza.obtenerLimpiezas();	
	}
	
	@RequestMapping(value ="/limpieza/buscarLimpiezas",method=RequestMethod.GET)
	public Limpieza buscarLimpieza(@RequestParam(name = "idLimpieza") int idLimpieza) {
		return this.serviceLimpieza.buscarLimpieza(idLimpieza);
	}
	
	
	//********************************************************************
	//Lote
	//********************************************************************
	
	//
	
	@RequestMapping(value = "/lote/crearLote",
			method = RequestMethod.GET)
	public Lote crearLote (@RequestParam(name ="idLote") int idLote,
							@RequestParam(name = "estado") String estado
							) {

		Lote lotes = new Lote(idLote , estado);
		this.serviceLote.crearLote(lotes);
		return lotes;

	}
		@RequestMapping (value ="/lote/listaLotes",
		method=RequestMethod.GET)
		public List<Lote> listadoLotes(){
		return this.serviceLote.obtenerLotes();
	}


		@RequestMapping (value ="/lote/buscarLote",
		method = RequestMethod.GET)
		public Lote buscarLote(@RequestParam(name ="idLote")int id) {
		return this.serviceLote.buscarLote(id);

		}
		
		//***********************************************************
		//ProductoEnlatado
		//***********************************************************
		
		
		//int idProducto, int cantLatas, double precio, String descripcion,
		//InventarioPeces tipoPezEnlatado
		
		@RequestMapping(value = "/productoEnlatado/crearProductoEnlatado",
				method = RequestMethod.GET)
		public ProductoEnlatado crearProductoEnlatado(@RequestParam(name ="idProducto") int idProducto,
								@RequestParam(name = "cantLatas") int cantLatas,
								@RequestParam(name = "precio") double precio,
								@RequestParam(name ="descripcion")String descripcion,
								@RequestParam(name = "id")  int tipoPezEnlatado) {

			InventarioPeces tipoPez = this.serviceInventarioPeces.buscarInventario(tipoPezEnlatado);
			ProductoEnlatado pEnlatado = new ProductoEnlatado(idProducto , cantLatas, precio, descripcion, tipoPez);
			this.serviceproductoEnlatado.crearProductoEnlatado(pEnlatado);
			return pEnlatado;

		}
		@RequestMapping (value ="/productoEnlatado/listaProductosEnlatados",
			method=RequestMethod.GET)
		public List<ProductoEnlatado> listadoProductosEnlatados(){
		return this.serviceproductoEnlatado.obtenerProductoEnlatado();
		}


		@RequestMapping (value ="/productoEnlatado/buscarProductoEnlatado",
				method = RequestMethod.GET)
		public ProductoEnlatado buscarProductoEnlatado(@RequestParam(name ="idProducto")int id) {
		return this.serviceproductoEnlatado.buscarProductoEnlatado(id);

		}
		
		//**********************************************************************
		//VENTAS
		//***********************************************************************
		
		//int idventa, String lugarVenta, LocalDate fecha, int cantidad, double precio,
		//ProductoEnlatado tipoProducto, Empleado empleado
		
		@RequestMapping (value="/ventas/crearVentas",
				method =RequestMethod.GET)
		public Ventas crearVentas(@RequestParam(name="idVenta") int idVenta,
								  @RequestParam(name= "lugarVenta") String lugarVenta,
								  @RequestParam(name="fecha")@DateTimeFormat(iso = ISO.DATE)  LocalDate fecha,
								  @RequestParam(name= "cantidad") int cantidad,
								  @RequestParam(name="precio")double precio,
								  @RequestParam(name="idProducto") int tipoProducto,
								  @RequestParam(name="idEmpleado") int empleado) {
			
			ProductoEnlatado pe= this.serviceproductoEnlatado.buscarProductoEnlatado(tipoProducto);
			Empleado e = this.serviceEmpleado.buscarEmpleado(empleado);
			Ventas venta = new Ventas(idVenta, lugarVenta, fecha, cantidad, precio, pe,e);
			return venta;
			
		}
				
				
				
		
	
	
	
}


