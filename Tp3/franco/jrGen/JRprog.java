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
	public Cap_ext_ op_VehiculoLadoB_intTovoid;
	public Cap_ext_ JRget_op_VehiculoLadoB_intTovoid() {
		return op_VehiculoLadoB_intTovoid;
	}
	public void JRset_op_VehiculoLadoB_intTovoid(Cap_ext_ op_VehiculoLadoB_intTovoid) {
		this.op_VehiculoLadoB_intTovoid = op_VehiculoLadoB_intTovoid;
	}

	public Cap_ext_ op_VehiculoLadoA_intTovoid;
	public Cap_ext_ JRget_op_VehiculoLadoA_intTovoid() {
		return op_VehiculoLadoA_intTovoid;
	}
	public void JRset_op_VehiculoLadoA_intTovoid(Cap_ext_ op_VehiculoLadoA_intTovoid) {
		this.op_VehiculoLadoA_intTovoid = op_VehiculoLadoA_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_VehiculoLadoB_intTovoid = copy.op_VehiculoLadoB_intTovoid;
	this.op_VehiculoLadoA_intTovoid = copy.op_VehiculoLadoA_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_VehiculoLadoB_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_VehiculoLadoA_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_VehiculoLadoB_intTovoid = Cap_ext_.noop;
	this.op_VehiculoLadoA_intTovoid = Cap_ext_.noop;

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
