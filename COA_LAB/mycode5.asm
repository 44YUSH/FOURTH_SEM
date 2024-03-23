;Aayush Sith
;2241019541

mov ax, 0000h
mov ds, ax
mov si, 2000h
mov al, [si]
mov cl, 08h
mov ch, 0000h

loop1: shr al, 01h
       jc loop2
       inc ch

loop2: dec cl
       jnz loop1
       inc si
       mov [si], ch
       
hlt