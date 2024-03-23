;Aayush Sith
;2241019541

mov ax, 0000h
mov ds, ax
mov bx, [2000h]
mov cx, [2002h]
mov dx, 0000h

loop1: add ax, bx
       jnc loop2
       inc dx
      
loop2: dec cx
       jnz loop1
       mov [2004h], ax
       mov [2006h], dx
hlt       