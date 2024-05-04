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
	public Cap_ext_ op_mostrar_voidTovoid;
	public Cap_ext_ JRget_op_mostrar_voidTovoid() {
		return op_mostrar_voidTovoid;
	}
	public void JRset_op_mostrar_voidTovoid(Cap_ext_ op_mostrar_voidTovoid) {
		this.op_mostrar_voidTovoid = op_mostrar_voidTovoid;
	}

	public Cap_ext_ op_impar_voidTovoid;
	public Cap_ext_ JRget_op_impar_voidTovoid() {
		return op_impar_voidTovoid;
	}
	public void JRset_op_impar_voidTovoid(Cap_ext_ op_impar_voidTovoid) {
		this.op_impar_voidTovoid = op_impar_voidTovoid;
	}

	public Cap_ext_ op_par_voidTovoid;
	public Cap_ext_ JRget_op_par_voidTovoid() {
		return op_par_voidTovoid;
	}
	public void JRset_op_par_voidTovoid(Cap_ext_ op_par_voidTovoid) {
		this.op_par_voidTovoid = op_par_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_mostrar_voidTovoid = copy.op_mostrar_voidTovoid;
	this.op_impar_voidTovoid = copy.op_impar_voidTovoid;
	this.op_par_voidTovoid = copy.op_par_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_mostrar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_impar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_par_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_mostrar_voidTovoid = Cap_ext_.noop;
	this.op_impar_voidTovoid = Cap_ext_.noop;
	this.op_par_voidTovoid = Cap_ext_.noop;

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
