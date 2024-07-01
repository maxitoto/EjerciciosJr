/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class ReaderWriterMonitor extends java.lang.Object {
    { JRinit(); }
    Op_ext.JRProxyOp JRget_op_m_mutex_voidTovoid()
    {
        return op_m_mutex_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_mutex_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_m_urgentq_voidTovoid()
    {
        return op_m_urgentq_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_urgentq_voidTovoid;
    
    int m_n_urgentq = 0;
    String m_name;
    
    public ReaderWriterMonitor(String n) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.m_name = n;
        JRprocess();
    }
    
    private void m_next() {
        if (m_n_urgentq > 0) {
            // Begin Expr2
            m_n_urgentq--;
            op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        } else {
            op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        }
    }
    private int lectoresActivos = 0;
    private int escritoresActivos = 0;
    private int escritoresEsperando = 0;
    private int lectoresEsperando = 0;
    private m_condvar puedo_leer = new m_condvar("puedo_leer");
    private m_condvar puedo_escribir = new m_condvar("puedo_escribir");
    
    public void start_read() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {150});
        // Begin Expr2
        lectoresEsperando++;
        if (escritoresActivos == 1) {
            {
                m_condvar m_cv = (puedo_leer);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        lectoresEsperando--;
        // Begin Expr2
        lectoresActivos++;
        // Begin Expr2
        m_next();
    }
    
    public void end_read() {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        (new Cap_ext_(JRget_op_pausa_intTovoid(), "void")).call(jrvm.getTimestamp(), new java.lang.Object [] {150});
        // Begin Expr2
        lectoresActivos--;
        if (escritoresEsperando > 0) {
            {
                if (((Boolean) (new Cap_ext_((puedo_escribir).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
        } else {
            {
                if (((Boolean) (new Cap_ext_((puedo_leer).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    
    public void write(int i) {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        // Begin Expr2
        escritoresEsperando++;
        if (lectoresActivos > 0 || escritoresActivos > 0) {
            {
                m_condvar m_cv = (puedo_escribir);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        escritoresEsperando--;
        // Begin Expr2
        escritoresActivos++;
        // Begin Expr2
        System.out.println("el proceso " + i + " escribio");
        // Begin Expr2
        escritoresActivos--;
        if (escritoresEsperando > 0) {
            {
                if (((Boolean) (new Cap_ext_((puedo_escribir).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
        } else {
            {
                if (((Boolean) (new Cap_ext_((puedo_leer).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    
    private static void pausaintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_pausa_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void pausaintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int tiempo = ((Number) JRargs[0]).intValue();
            {
                try {
                    // Begin Expr2
                    Thread.sleep(tiempo);
                } catch (java.lang.Exception e) {
                }
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

            }
        } catch (Exception JRe)    {
            if (retOp != null && fretOp == null)
            {
        	// if it is a forward cocall with handler
        	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
        	    handler.JRhandler(JRe);
        	else
        	    // give preference to propagation through the call stack
        	    retOp.send(jrvm.getTimestamp(), JRe);
            }
            else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// for COSTMT exception handling in operation
        	if (handler != null)
        	    handler.JRhandler(JRe);
        	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
            }
            else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
            {
        	// this should only be for a send/forward
        	handler.JRhandler(JRe);
        	// can rethrow below just to get out of this method
            }
            // rethrow the proper type of exception
            // catch all
            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
        }
    }
    private static Op_ext.JRProxyOp JRget_op_pausa_intTovoid()
    {
        return op_pausa_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_pausa_intTovoid;
    static class ProcOp_intTovoid_implpausa extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implpausa(ReaderWriterMonitor thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                ReaderWriterMonitor.pausaintTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    ReaderWriterMonitor.pausaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    ;
    static    {
        try    {
            op_pausa_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implpausa(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    protected boolean JRcalled = false;
    protected JRReaderWriterMonitor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_m_urgentq_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_m_mutex_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRReaderWriterMonitor(op_pausa_intTovoid, op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
