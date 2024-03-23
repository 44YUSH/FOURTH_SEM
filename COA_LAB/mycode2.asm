;Aayush Sith
;2241019541
mov ax, 0000h
mov ds,ax   

mov al, 12h
mov [3000h], al
mov bl, al
shr al,01h
xor al,bl
mov [3001h],al

mov si, 3002h
mov al, [si]
ROR al, 04h
inc si
mov [si], al



hlt