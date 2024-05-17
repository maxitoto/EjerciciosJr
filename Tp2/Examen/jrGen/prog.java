/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class prog extends java.lang.Object {
    { JRinit(); }
    
    public prog() {
        // Begin Expr2
        super();
        JRprocess();
    }
    static final int cantC = 4;
    static final int cantB = 2;
    static // NUMBER 8
    Cap_ext_[] barberos = new // NUMBER 8
    Cap_ext_[cantB];
    static // NUMBER 8
    Cap_ext_[] cortar = new // NUMBER 8
    Cap_ext_[cantB];
    static // NUMBER 8
    Cap_ext_[] sentarse = new // NUMBER 8
    Cap_ext_[cantB];
    static {
        JRLoop0: for (int i = 0; i < cantB; i++) {
            // Begin Expr2
            barberos[i] = new Cap_ext_(new Op_ext_.JRProxyOp(InOp_ext_impl.create((0))));
            // Begin Expr2
            cortar[i] = new Cap_ext_(new Op_ext_.JRProxyOp(InOp_ext_impl.create((0))));
            // Begin Expr2
            sentarse[i] = new Cap_ext_(new Op_ext_.JRProxyOp(InOp_ext_impl.create((0))));
        }
    }
    static Op_ext.JRProxyOp JRget_op_espera_voidTovoid()
    {
        return op_espera_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_espera_voidTovoid;
    ;
    static    {
        try    {
            op_espera_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_espera_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutexC_voidTovoid()
    {
        return op_mutexC_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexC_voidTovoid;
    ;
    static    {
        try    {
            op_mutexC_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 1;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_mutexC_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutexB_voidTovoid()
    {
        return op_mutexB_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexB_voidTovoid;
    ;
    static    {
        try    {
            op_mutexB_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 1;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_mutexB_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_corteterminado_voidTovoid()
    {
        return op_corteterminado_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_corteterminado_voidTovoid;
    ;
    static    {
        try    {
            op_corteterminado_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_corteterminado_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_listo_voidTovoid()
    {
        return op_listo_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_listo_voidTovoid;
    ;
    static    {
        try    {
            op_listo_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_listo_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_mutex_voidTovoid()
    {
        return op_mutex_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutex_voidTovoid;
    ;
    static    {
        try    {
            op_mutex_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 1;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int sillas = 2;
    static int sillalibre = 2;
    static int clientesEsperando = 0;
    public static Op_ext.JRProxyOp JRget_op_Barberia_intTovoid()
    {
        return op_Barberia_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Barberia_intTovoid;
    static class ProcOp_intTovoid_implBarberia extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implBarberia(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.BarberiaintTovoid(null, null, null, JRargs);
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
                    prog.BarberiaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_Barberia_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implBarberia(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    public static void BarberiaintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Barberia_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void BarberiaintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                // Begin Expr2
                System.out.println("Barbero " + i + " entra a la barberia");
                JRLoop1: while (true) {
                    if (clientesEsperando == 0 | clientesEsperando == cantC) {
                        // Begin Expr2
                        System.out.println("Barbero " + i + " no tiene cliente");
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = barberos[i].recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // Begin Expr2
                        System.out.println("Barbero " + i + " tiene cliente");
                    }
                    // Begin Expr2
                    System.out.println("Barbero " + i + " listo para cortar");
                    cortar[i].send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = sentarse[i].recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // Begin Expr2
                    System.out.println("Barbero " + i + " Corta cabello");
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = JRget_op_mutexC_voidTovoid().recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    cortar[i].send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = sentarse[i].recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // Begin Expr2
                    System.out.println("Barbero " + i + " Cobra");
                    // Begin Expr2
                    System.out.println("Barbero " + i + " se Despide");
                    JRget_op_mutexB_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                }
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
    static {
        try {
            for (int i = 0; i < cantB; i++) {
                op_Barberia_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    public static Op_ext.JRProxyOp JRget_op_Clientela_intTovoid()
    {
        return op_Clientela_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_Clientela_intTovoid;
    static class ProcOp_intTovoid_implClientela extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implClientela(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.ClientelaintTovoid(null, null, null, JRargs);
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
                    prog.ClientelaintTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
            op_Clientela_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implClientela(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    public static void ClientelaintTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_Clientela_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void ClientelaintTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_mutex_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // Begin Expr2
                clientesEsperando += 1;
                // Begin Expr2
                System.out.println("Cliente " + i + " Entra a la barberia");
                if (clientesEsperando > 2) {
                    JRget_op_mutex_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                    // Begin Expr2
                    System.out.println("Cliente " + i + " debe esperar");
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = JRget_op_espera_voidTovoid().recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                    // Begin Expr2
                    System.out.println("Cliente " + i + " es el siguiente");
                } else {
                    barberos[clientesEsperando - 1].send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                    JRget_op_mutex_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                }
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_mutex_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                int miSilla = /*JR init for inni*/ 0;
                if (clientesEsperando == 1 | clientesEsperando == 2) {
                    // Begin Expr2
                    miSilla = clientesEsperando - 1;
                } else {
                    // Begin Expr2
                    miSilla = sillalibre - 1;
                }
                // Begin Expr2
                sillas -= 1;
                if (sillas == 0 & (miSilla == 2 | miSilla == 1)) {
                    // Begin Expr2
                    sillalibre = 0;
                } else {
                    if (sillas == 1 & sillalibre == 2) {
                        // Begin Expr2
                        sillalibre = 1;
                    } else {
                        // Begin Expr2
                        sillalibre = 2;
                    }
                }
                JRget_op_mutex_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                sentarse[miSilla].send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = cortar[miSilla].recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // Begin Expr2
                System.out.println("Cliente " + i + " Le corta el cabello el barbero " + miSilla);
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_mutexB_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                sentarse[miSilla].send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = cortar[miSilla].recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // Begin Expr2
                System.out.println("Cliente " + i + " Paga al barbero " + miSilla);
                // Begin Expr2
                System.out.println("Cliente " + i + " se va de la barberia");
                JRget_op_mutexC_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_mutex_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // Begin Expr2
                sillalibre = miSilla;
                // Begin Expr2
                sillas += 1;
                JRget_op_mutex_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_mutex_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                if (clientesEsperando - 1 < cantC) {
                    JRget_op_espera_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                }
                JRget_op_mutex_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
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
    static {
        try {
            for (int i = 0; i < cantC; i++) {
                op_Clientela_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    
    public static void main(String[] args) {
    }
    protected boolean JRcalled = false;
    protected JRprog jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRprog(op_Clientela_intTovoid, op_Barberia_intTovoid, op_mutex_voidTovoid, op_listo_voidTovoid, op_corteterminado_voidTovoid, op_mutexB_voidTovoid, op_mutexC_voidTovoid, op_espera_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
