/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPizzeriaMonitor
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_m_urgentq_voidTovoid;
	public Cap_ext_ JRget_op_m_urgentq_voidTovoid() {
		return op_m_urgentq_voidTovoid;
	}
	public void JRset_op_m_urgentq_voidTovoid(Cap_ext_ op_m_urgentq_voidTovoid) {
		this.op_m_urgentq_voidTovoid = op_m_urgentq_voidTovoid;
	}

	public Cap_ext_ op_m_mutex_voidTovoid;
	public Cap_ext_ JRget_op_m_mutex_voidTovoid() {
		return op_m_mutex_voidTovoid;
	}
	public void JRset_op_m_mutex_voidTovoid(Cap_ext_ op_m_mutex_voidTovoid) {
		this.op_m_mutex_voidTovoid = op_m_mutex_voidTovoid;
	}

	public JRPizzeriaMonitor(JRPizzeriaMonitor copy)
	{
	this.op_m_urgentq_voidTovoid = copy.op_m_urgentq_voidTovoid;
	this.op_m_mutex_voidTovoid = copy.op_m_mutex_voidTovoid;

	}
	public JRPizzeriaMonitor(Object ... opSig)
	{
	this.op_m_urgentq_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_m_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRPizzeriaMonitor(boolean dummy)	{
	    super(dummy);
	this.op_m_urgentq_voidTovoid = Cap_ext_.noop;
	this.op_m_mutex_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPizzeriaMonitor(true);
	}
    }
