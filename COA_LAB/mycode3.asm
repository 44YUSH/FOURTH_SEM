;Aayush Sith
;2241019541

mov ax, 0000h
mov ds, ax
mov al, [2000h]
mov cl, [2001h]
sal al, cl
mov [2002h], al
hlt