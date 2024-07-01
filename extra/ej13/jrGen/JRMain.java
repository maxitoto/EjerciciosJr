/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRMain
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_procesos_intTovoid;
	public Cap_ext_ JRget_op_procesos_intTovoid() {
		return op_procesos_intTovoid;
	}
	public void JRset_op_procesos_intTovoid(Cap_ext_ op_procesos_intTovoid) {
		this.op_procesos_intTovoid = op_procesos_intTovoid;
	}

	public Cap_ext_ op_cpu_dos_voidTovoid;
	public Cap_ext_ JRget_op_cpu_dos_voidTovoid() {
		return op_cpu_dos_voidTovoid;
	}
	public void JRset_op_cpu_dos_voidTovoid(Cap_ext_ op_cpu_dos_voidTovoid) {
		this.op_cpu_dos_voidTovoid = op_cpu_dos_voidTovoid;
	}

	public Cap_ext_ op_cpu_uno_voidTovoid;
	public Cap_ext_ JRget_op_cpu_uno_voidTovoid() {
		return op_cpu_uno_voidTovoid;
	}
	public void JRset_op_cpu_uno_voidTovoid(Cap_ext_ op_cpu_uno_voidTovoid) {
		this.op_cpu_uno_voidTovoid = op_cpu_uno_voidTovoid;
	}

	public JRMain(JRMain copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_procesos_intTovoid = copy.op_procesos_intTovoid;
	this.op_cpu_dos_voidTovoid = copy.op_cpu_dos_voidTovoid;
	this.op_cpu_uno_voidTovoid = copy.op_cpu_uno_voidTovoid;

	}
	public JRMain(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_procesos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_cpu_dos_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_cpu_uno_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRMain(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_procesos_intTovoid = Cap_ext_.noop;
	this.op_cpu_dos_voidTovoid = Cap_ext_.noop;
	this.op_cpu_uno_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRMain(true);
	}
    }
