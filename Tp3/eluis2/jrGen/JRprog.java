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
	public Cap_ext_ op_fumador_intTovoid;
	public Cap_ext_ JRget_op_fumador_intTovoid() {
		return op_fumador_intTovoid;
	}
	public void JRset_op_fumador_intTovoid(Cap_ext_ op_fumador_intTovoid) {
		this.op_fumador_intTovoid = op_fumador_intTovoid;
	}

	public Cap_ext_ op_agente_voidTovoid;
	public Cap_ext_ JRget_op_agente_voidTovoid() {
		return op_agente_voidTovoid;
	}
	public void JRset_op_agente_voidTovoid(Cap_ext_ op_agente_voidTovoid) {
		this.op_agente_voidTovoid = op_agente_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_fumador_intTovoid = copy.op_fumador_intTovoid;
	this.op_agente_voidTovoid = copy.op_agente_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_fumador_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_agente_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_fumador_intTovoid = Cap_ext_.noop;
	this.op_agente_voidTovoid = Cap_ext_.noop;

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
