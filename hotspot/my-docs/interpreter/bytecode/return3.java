return  177 return  [0x07f23b60, 0x07f241f0]  1680 bytes

  0x07f23b60: sub    $0x4,%esp
  0x07f23b63: fstps  (%esp)
  0x07f23b66: jmp    0x07f23b84
  0x07f23b6b: sub    $0x8,%esp
  0x07f23b6e: fstpl  (%esp)
  0x07f23b71: jmp    0x07f23b84
  0x07f23b76: push   %edx
  0x07f23b77: push   %eax
  0x07f23b78: jmp    0x07f23b84
  0x07f23b7d: push   %eax
  0x07f23b7e: jmp    0x07f23b84
  0x07f23b83: push   %eax

  0x07f23b84: mov    %fs:0x0(,%eiz,1),%ecx
  0x07f23b8c: mov    -0xc(%ecx),%ecx

  0x07f23b8f: mov    0x1a1(%ecx),%bl
  0x07f23b95: mov    %ebx,%edi
  0x07f23b97: movb   $0x0,0x1a1(%ecx)

  0x07f23b9e: mov    -0xc(%ebp),%ebx
  0x07f23ba1: mov    0x14(%ebx),%ecx
  0x07f23ba4: test   $0x20,%ecx
  0x07f23baa: je     0x07f23eac

  // Don't unlock anything if the _do_not_unlock_if_synchronized flag
  // is set.
  0x07f23bb0: mov    %edi,%ecx
  0x07f23bb2: test   $0xff,%cl
  0x07f23bb5: jne    0x07f2402a

  0x07f23bbb: lea    -0x28(%ebp),%edx // address of first monitor
  0x07f23bbe: mov    0x4(%edx),%eax
  0x07f23bc1: test   %eax,%eax
  0x07f23bc3: jne    0x07f23d28

  0x07f23bc9: emms   //empty_FPU_stack
  0x07f23bcb: call   0x07f23bd5
  0x07f23bd0: jmp    0x07f23d17
  0x07f23bd5: lea    0x4(%esp),%eax
  0x07f23bd9: cmpl   $0x0,-0x8(%ebp)
  0x07f23be0: je     0x07f23bf7
  0x07f23be6: push   $0x5847a9d4
  0x07f23beb: call   0x07f23bf0
  0x07f23bf0: pusha  
  0x07f23bf1: call   0x57f3df50
  0x07f23bf6: hlt    
  0x07f23bf7: mov    %esi,-0x1c(%ebp)
  0x07f23bfa: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23c02: mov    -0xc(%edi),%edi
  0x07f23c05: push   %edi
  0x07f23c06: mov    %ebp,0x144(%edi)
  0x07f23c0c: mov    %eax,0x13c(%edi)
  0x07f23c12: call   0x581bd710
  0x07f23c17: add    $0x4,%esp
  0x07f23c1a: push   %eax
  0x07f23c1b: mov    %fs:0x0(,%eiz,1),%eax
  0x07f23c23: mov    -0xc(%eax),%eax
  0x07f23c26: cmp    %eax,%edi
  0x07f23c28: je     0x07f23c3f
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x07f23c2e: push   $0x5847d0e8
  0x07f23c33: call   0x07f23c38
  0x07f23c38: pusha  
  0x07f23c39: call   0x57f3df50
  0x07f23c3e: hlt    
  0x07f23c3f: pop    %eax
  0x07f23c40: movl   $0x0,0x13c(%edi)
  0x07f23c4a: movl   $0x0,0x144(%edi)
  0x07f23c54: mov    0x1c8(%edi),%edi
  0x07f23c5a: test   $0x1,%edi
  0x07f23c60: je     0x07f23c97
  0x07f23c66: test   $0x2,%edi
  0x07f23c6c: jne    0x07f23c97
  0x07f23c72: cmpl   $0x0,-0x8(%ebp)
  0x07f23c79: je     0x07f23c90
  0x07f23c7f: push   $0x5847a994
  0x07f23c84: call   0x07f23c89
  0x07f23c89: pusha  
  0x07f23c8a: call   0x57f3df50
  0x07f23c8f: hlt    
  0x07f23c90: call   0x57f37180
  0x07f23c95: jmp    *%eax
  0x07f23c97: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23c9f: mov    -0xc(%edi),%edi
  0x07f23ca2: mov    0x324(%edi),%edi
  0x07f23ca8: test   %edi,%edi
  0x07f23caa: je     0x07f23cf8
  0x07f23cb0: mov    0x50(%edi),%edi
  0x07f23cb3: cmp    $0x1,%edi
  0x07f23cb6: jne    0x07f23cf8
  0x07f23cbc: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23cc4: mov    -0xc(%edi),%edi
  0x07f23cc7: mov    0x324(%edi),%edi
  0x07f23ccd: pushl  0x54(%edi)
  0x07f23cd0: cmpl   $0x0,-0x8(%ebp)
  0x07f23cd7: je     0x07f23cee
  0x07f23cdd: push   $0x5847a994
  0x07f23ce2: call   0x07f23ce7
  0x07f23ce7: pusha  
  0x07f23ce8: call   0x57f3df50
  0x07f23ced: hlt    
  0x07f23cee: call   0x57f37160
  0x07f23cf3: add    $0x4,%esp
  0x07f23cf6: jmp    *%eax
  0x07f23cf8: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23d00: mov    -0xc(%edi),%edi
  0x07f23d03: cmpl   $0x0,0x4(%edi)
  0x07f23d0a: jne    0x07f00380
  0x07f23d10: mov    -0x1c(%ebp),%esi
  0x07f23d13: mov    -0x18(%ebp),%edi
  0x07f23d16: ret  
  
  0x07f23d17: push   $0x58467db8
  0x07f23d1c: call   0x07f23d21
  0x07f23d21: pusha  
  0x07f23d22: call   0x57f3df50
  0x07f23d27: hlt    

  0x07f23d28: mov    %esi,-0x1c(%ebp)
  0x07f23d2b: lea    (%edx),%eax
  0x07f23d2d: mov    0x4(%edx),%ecx
  0x07f23d30: movl   $0x0,0x4(%edx)
  0x07f23d37: mov    (%ecx),%ebx
  0x07f23d39: and    $0x7,%ebx
  0x07f23d3c: cmp    $0x5,%ebx
  0x07f23d3f: je     0x07f23ea9
  0x07f23d45: mov    (%eax),%ebx
  0x07f23d47: test   %ebx,%ebx
  0x07f23d49: je     0x07f23ea9
  0x07f23d4f: lock cmpxchg %ebx,(%ecx)
  0x07f23d53: je     0x07f23ea9
  0x07f23d59: mov    %ecx,0x4(%edx)

  0x07f23d5c: call   0x07f23d66
  0x07f23d61: jmp    0x07f23ea9
  0x07f23d66: push   %edx
  0x07f23d67: lea    0x8(%esp),%eax
  0x07f23d6b: cmpl   $0x0,-0x8(%ebp)
  0x07f23d72: je     0x07f23d89
  0x07f23d78: push   $0x5847a9d4
  0x07f23d7d: call   0x07f23d82
  0x07f23d82: pusha  
  0x07f23d83: call   0x57f3df50
  0x07f23d88: hlt    
  0x07f23d89: mov    %esi,-0x1c(%ebp)
  0x07f23d8c: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23d94: mov    -0xc(%edi),%edi
  0x07f23d97: push   %edi
  0x07f23d98: mov    %ebp,0x144(%edi)
  0x07f23d9e: mov    %eax,0x13c(%edi)
  0x07f23da4: call   0x581bd520
  0x07f23da9: add    $0x8,%esp
  0x07f23dac: push   %eax
  0x07f23dad: mov    %fs:0x0(,%eiz,1),%eax
  0x07f23db5: mov    -0xc(%eax),%eax
  0x07f23db8: cmp    %eax,%edi
  0x07f23dba: je     0x07f23dd1
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x07f23dc0: push   $0x5847d0e8
  0x07f23dc5: call   0x07f23dca
  0x07f23dca: pusha  
  0x07f23dcb: call   0x57f3df50
  0x07f23dd0: hlt    
  0x07f23dd1: pop    %eax
  0x07f23dd2: movl   $0x0,0x13c(%edi)
  0x07f23ddc: movl   $0x0,0x144(%edi)
  0x07f23de6: mov    0x1c8(%edi),%edi
  0x07f23dec: test   $0x1,%edi
  0x07f23df2: je     0x07f23e29
  0x07f23df8: test   $0x2,%edi
  0x07f23dfe: jne    0x07f23e29
  0x07f23e04: cmpl   $0x0,-0x8(%ebp)
  0x07f23e0b: je     0x07f23e22
  0x07f23e11: push   $0x5847a994
  0x07f23e16: call   0x07f23e1b
  0x07f23e1b: pusha  
  0x07f23e1c: call   0x57f3df50
  0x07f23e21: hlt    
  0x07f23e22: call   0x57f37180
  0x07f23e27: jmp    *%eax
  0x07f23e29: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23e31: mov    -0xc(%edi),%edi
  0x07f23e34: mov    0x324(%edi),%edi
  0x07f23e3a: test   %edi,%edi
  0x07f23e3c: je     0x07f23e8a
  0x07f23e42: mov    0x50(%edi),%edi
  0x07f23e45: cmp    $0x1,%edi
  0x07f23e48: jne    0x07f23e8a
  0x07f23e4e: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23e56: mov    -0xc(%edi),%edi
  0x07f23e59: mov    0x324(%edi),%edi
  0x07f23e5f: pushl  0x54(%edi)
  0x07f23e62: cmpl   $0x0,-0x8(%ebp)
  0x07f23e69: je     0x07f23e80
  0x07f23e6f: push   $0x5847a994
  0x07f23e74: call   0x07f23e79
  0x07f23e79: pusha  
  0x07f23e7a: call   0x57f3df50
  0x07f23e7f: hlt    
  0x07f23e80: call   0x57f37160
  0x07f23e85: add    $0x4,%esp
  0x07f23e88: jmp    *%eax
  0x07f23e8a: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23e92: mov    -0xc(%edi),%edi
  0x07f23e95: cmpl   $0x0,0x4(%edi)
  0x07f23e9c: jne    0x07f00380
  0x07f23ea2: mov    -0x1c(%ebp),%esi
  0x07f23ea5: mov    -0x18(%ebp),%edi
  0x07f23ea8: ret    

  0x07f23ea9: mov    -0x1c(%ebp),%esi
  0x07f23eac: mov    -0x20(%ebp),%ecx
  0x07f23eaf: lea    -0x20(%ebp),%ebx
  0x07f23eb2: jmp    0x07f24026

  0x07f23eb7: emms   
  0x07f23eb9: call   0x07f23ec3
  0x07f23ebe: jmp    0x07f24005
  0x07f23ec3: lea    0x4(%esp),%eax
  0x07f23ec7: cmpl   $0x0,-0x8(%ebp)
  0x07f23ece: je     0x07f23ee5
  0x07f23ed4: push   $0x5847a9d4
  0x07f23ed9: call   0x07f23ede
  0x07f23ede: pusha  
  0x07f23edf: call   0x57f3df50
  0x07f23ee4: hlt    
  0x07f23ee5: mov    %esi,-0x1c(%ebp)
  0x07f23ee8: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23ef0: mov    -0xc(%edi),%edi
  0x07f23ef3: push   %edi
  0x07f23ef4: mov    %ebp,0x144(%edi)
  0x07f23efa: mov    %eax,0x13c(%edi)
  0x07f23f00: call   0x581bd710
  0x07f23f05: add    $0x4,%esp
  0x07f23f08: push   %eax
  0x07f23f09: mov    %fs:0x0(,%eiz,1),%eax
  0x07f23f11: mov    -0xc(%eax),%eax
  0x07f23f14: cmp    %eax,%edi
  0x07f23f16: je     0x07f23f2d
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x07f23f1c: push   $0x5847d0e8
  0x07f23f21: call   0x07f23f26
  0x07f23f26: pusha  
  0x07f23f27: call   0x57f3df50
  0x07f23f2c: hlt    
  0x07f23f2d: pop    %eax
  0x07f23f2e: movl   $0x0,0x13c(%edi)
  0x07f23f38: movl   $0x0,0x144(%edi)
  0x07f23f42: mov    0x1c8(%edi),%edi
  0x07f23f48: test   $0x1,%edi
  0x07f23f4e: je     0x07f23f85
  0x07f23f54: test   $0x2,%edi
  0x07f23f5a: jne    0x07f23f85
  0x07f23f60: cmpl   $0x0,-0x8(%ebp)
  0x07f23f67: je     0x07f23f7e
  0x07f23f6d: push   $0x5847a994
  0x07f23f72: call   0x07f23f77
  0x07f23f77: pusha  
  0x07f23f78: call   0x57f3df50
  0x07f23f7d: hlt    
  0x07f23f7e: call   0x57f37180
  0x07f23f83: jmp    *%eax
  0x07f23f85: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23f8d: mov    -0xc(%edi),%edi
  0x07f23f90: mov    0x324(%edi),%edi
  0x07f23f96: test   %edi,%edi
  0x07f23f98: je     0x07f23fe6
  0x07f23f9e: mov    0x50(%edi),%edi
  0x07f23fa1: cmp    $0x1,%edi
  0x07f23fa4: jne    0x07f23fe6
  0x07f23faa: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23fb2: mov    -0xc(%edi),%edi
  0x07f23fb5: mov    0x324(%edi),%edi
  0x07f23fbb: pushl  0x54(%edi)
  0x07f23fbe: cmpl   $0x0,-0x8(%ebp)
  0x07f23fc5: je     0x07f23fdc
  0x07f23fcb: push   $0x5847a994
  0x07f23fd0: call   0x07f23fd5
  0x07f23fd5: pusha  
  0x07f23fd6: call   0x57f3df50
  0x07f23fdb: hlt    
  0x07f23fdc: call   0x57f37160
  0x07f23fe1: add    $0x4,%esp
  0x07f23fe4: jmp    *%eax
  0x07f23fe6: mov    %fs:0x0(,%eiz,1),%edi
  0x07f23fee: mov    -0xc(%edi),%edi
  0x07f23ff1: cmpl   $0x0,0x4(%edi)
  0x07f23ff8: jne    0x07f00380
  0x07f23ffe: mov    -0x1c(%ebp),%esi
  0x07f24001: mov    -0x18(%ebp),%edi
  0x07f24004: ret    

  0x07f24005: push   $0x58467db8
  0x07f2400a: call   0x07f2400f
  0x07f2400f: pusha  
  0x07f24010: call   0x57f3df50
  0x07f24015: hlt    

  0x07f24016: cmpl   $0x0,0x4(%ecx)
  0x07f2401d: jne    0x07f23eb7

  0x07f24023: add    $0x8,%ecx
  0x07f24026: cmp    %ebx,%ecx
  0x07f24028: jne    0x07f24016

  //InterpreterMacroAssembler::notify_method_exit
  0x07f2402a: mov    %fs:0x0(,%eiz,1),%ecx
  0x07f24032: mov    -0xc(%ecx),%ecx
  0x07f24035: mov    0x32c(%ecx),%ecx
  0x07f2403b: test   %ecx,%ecx
  0x07f2403d: je     0x07f2418f

  0x07f24043: call   0x07f2404d
  0x07f24048: jmp    0x07f2418f
  0x07f2404d: lea    0x4(%esp),%eax
  0x07f24051: cmpl   $0x0,-0x8(%ebp)
  0x07f24058: je     0x07f2406f
  0x07f2405e: push   $0x5847a9d4
  0x07f24063: call   0x07f24068
  0x07f24068: pusha  
  0x07f24069: call   0x57f3df50
  0x07f2406e: hlt    
  0x07f2406f: mov    %esi,-0x1c(%ebp)
  0x07f24072: mov    %fs:0x0(,%eiz,1),%edi
  0x07f2407a: mov    -0xc(%edi),%edi
  0x07f2407d: push   %edi
  0x07f2407e: mov    %ebp,0x144(%edi)
  0x07f24084: mov    %eax,0x13c(%edi)
  0x07f2408a: call   0x581bf1b0
  0x07f2408f: add    $0x4,%esp
  0x07f24092: push   %eax
  0x07f24093: mov    %fs:0x0(,%eiz,1),%eax
  0x07f2409b: mov    -0xc(%eax),%eax
  0x07f2409e: cmp    %eax,%edi
  0x07f240a0: je     0x07f240b7
  ;; MacroAssembler::call_VM_base: rdi not callee saved?
  0x07f240a6: push   $0x5847d0e8
  0x07f240ab: call   0x07f240b0
  0x07f240b0: pusha  
  0x07f240b1: call   0x57f3df50
  0x07f240b6: hlt    
  0x07f240b7: pop    %eax
  0x07f240b8: movl   $0x0,0x13c(%edi)
  0x07f240c2: movl   $0x0,0x144(%edi)
  0x07f240cc: mov    0x1c8(%edi),%edi
  0x07f240d2: test   $0x1,%edi
  0x07f240d8: je     0x07f2410f
  0x07f240de: test   $0x2,%edi
  0x07f240e4: jne    0x07f2410f
  0x07f240ea: cmpl   $0x0,-0x8(%ebp)
  0x07f240f1: je     0x07f24108
  0x07f240f7: push   $0x5847a994
  0x07f240fc: call   0x07f24101
  0x07f24101: pusha  
  0x07f24102: call   0x57f3df50
  0x07f24107: hlt    
  0x07f24108: call   0x57f37180
  0x07f2410d: jmp    *%eax
  0x07f2410f: mov    %fs:0x0(,%eiz,1),%edi
  0x07f24117: mov    -0xc(%edi),%edi
  0x07f2411a: mov    0x324(%edi),%edi
  0x07f24120: test   %edi,%edi
  0x07f24122: je     0x07f24170
  0x07f24128: mov    0x50(%edi),%edi
  0x07f2412b: cmp    $0x1,%edi
  0x07f2412e: jne    0x07f24170
  0x07f24134: mov    %fs:0x0(,%eiz,1),%edi
  0x07f2413c: mov    -0xc(%edi),%edi
  0x07f2413f: mov    0x324(%edi),%edi
  0x07f24145: pushl  0x54(%edi)
  0x07f24148: cmpl   $0x0,-0x8(%ebp)
  0x07f2414f: je     0x07f24166
  0x07f24155: push   $0x5847a994
  0x07f2415a: call   0x07f2415f
  0x07f2415f: pusha  
  0x07f24160: call   0x57f3df50
  0x07f24165: hlt    
  0x07f24166: call   0x57f37160
  0x07f2416b: add    $0x4,%esp
  0x07f2416e: jmp    *%eax
  0x07f24170: mov    %fs:0x0(,%eiz,1),%edi
  0x07f24178: mov    -0xc(%edi),%edi
  0x07f2417b: cmpl   $0x0,0x4(%edi)
  0x07f24182: jne    0x07f00380
  0x07f24188: mov    -0x1c(%ebp),%esi
  0x07f2418b: mov    -0x18(%ebp),%edi
  0x07f2418e: ret    

  0x07f2418f: cmpb   $0x0,0x587b1c0c
  0x07f24196: je     0x07f241d2
  0x07f2419c: mov    %fs:0x0(,%eiz,1),%ebx
  0x07f241a4: mov    -0xc(%ebx),%ebx
  0x07f241a7: mov    -0xc(%ebp),%ecx
  0x07f241aa: push   %ecx
  0x07f241ab: push   %ebx
  0x07f241ac: cmpl   $0x0,-0x8(%ebp)
  0x07f241b3: je     0x07f241ca
  0x07f241b9: push   $0x5847a994
  0x07f241be: call   0x07f241c3
  0x07f241c3: pusha  
  0x07f241c4: call   0x57f3df50
  0x07f241c9: hlt    
  0x07f241ca: call   0x58381c60
  0x07f241cf: add    $0x8,%esp

  // remove activation
  0x07f241d2: mov    -0x4(%ebp),%ebx //argument word n 所在堆栈位置
  0x07f241d5: mov    %ebp,%esp
  0x07f241d7: pop    %ebp
  0x07f241d8: pop    %esi //返回地址
  0x07f241d9: mov    %ebx,%esp
  0x07f241db: jmp    *%esi

  //TemplateInterpreterGenerator::generate_and_dispatch的should_not_reach_here()
  0x07f241dd: push   $0x58467db8
  0x07f241e2: call   0x07f241e7
  0x07f241e7: pusha  
  0x07f241e8: call   0x57f3df50
  0x07f241ed: hlt    

  0x07f241ee: nop    
  0x07f241ef: nop    
