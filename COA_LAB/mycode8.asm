;Aayush Sith
;2241019541

mov ax, 0000h
mov ds, ax

;Objective count one

mov si, 2000h
mov al, [si]
mov ch, 08h
mov cl, 08h

loop1: shr al, 01h
       jc loop2
       dec ch
      
loop2: dec cl
       jnc loop1
       inc si
       mov [si], ch
hlt