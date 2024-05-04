/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRprog
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_escritor_intTovoid;
	public Cap_ext_ JRget_op_escritor_intTovoid() {
		return op_escritor_intTovoid;
	}
	public void JRset_op_escritor_intTovoid(Cap_ext_ op_escritor_intTovoid) {
		this.op_escritor_intTovoid = op_escritor_intTovoid;
	}

	public Cap_ext_ op_lector_intTovoid;
	public Cap_ext_ JRget_op_lector_intTovoid() {
		return op_lector_intTovoid;
	}
	public void JRset_op_lector_intTovoid(Cap_ext_ op_lector_intTovoid) {
		this.op_lector_intTovoid = op_lector_intTovoid;
	}

	public Cap_ext_ op_espera_intXintXintTovoid;
	public Cap_ext_ JRget_op_espera_intXintXintTovoid() {
		return op_espera_intXintXintTovoid;
	}
	public void JRset_op_espera_intXintXintTovoid(Cap_ext_ op_espera_intXintXintTovoid) {
		this.op_espera_intXintXintTovoid = op_espera_intXintXintTovoid;
	}

	public Cap_ext_ op_escritor_voidTovoid;
	public Cap_ext_ JRget_op_escritor_voidTovoid() {
		return op_escritor_voidTovoid;
	}
	public void JRset_op_escritor_voidTovoid(Cap_ext_ op_escritor_voidTovoid) {
		this.op_escritor_voidTovoid = op_escritor_voidTovoid;
	}

	public Cap_ext_ op_estaescribiendo_voidTovoid;
	public Cap_ext_ JRget_op_estaescribiendo_voidTovoid() {
		return op_estaescribiendo_voidTovoid;
	}
	public void JRset_op_estaescribiendo_voidTovoid(Cap_ext_ op_estaescribiendo_voidTovoid) {
		this.op_estaescribiendo_voidTovoid = op_estaescribiendo_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_escritor_intTovoid = copy.op_escritor_intTovoid;
	this.op_lector_intTovoid = copy.op_lector_intTovoid;
	this.op_espera_intXintXintTovoid = copy.op_espera_intXintXintTovoid;
	this.op_escritor_voidTovoid = copy.op_escritor_voidTovoid;
	this.op_estaescribiendo_voidTovoid = copy.op_estaescribiendo_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intXintXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_escritor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_estaescribiendo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_escritor_intTovoid = Cap_ext_.noop;
	this.op_lector_intTovoid = Cap_ext_.noop;
	this.op_espera_intXintXintTovoid = Cap_ext_.noop;
	this.op_escritor_voidTovoid = Cap_ext_.noop;
	this.op_estaescribiendo_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRprog(true);
	}
    }
