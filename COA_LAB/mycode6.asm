;Aayush Sith
;2241019541

mov ax, 0000h
mov ds, ax
mov si, 3000h
mov di, 5000h
mov cl, 05h
loop: mov bx, [si]
      mov [di], si
      inc si
      inc si
      inc di
      inc di
      dec cl
      jnz loop
hlt