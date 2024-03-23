;Aayush Sith
;2241019541
mov ax, 0000h
mov ds, ax
mov si, 2000h
mov cl, [si]
mov ch, 00h
mov bx, cx
mov ax, 0000h

loop1: inc si
       inc si
       add ax, [si]
       jnc loop2
       inc ch

loop2: dec cl
       jnz loop1
       inc si
       inc si
       mov [si], ax  ;sum
       inc si
       inc si
       mov [si], ch  ;upperbit      
;Average
div bx
inc si
inc si
mov [si], ax
inc si
inc si
mov [si], dx
hlt