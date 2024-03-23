;Aayush Sith
;2241019541
mov ax, 0000h
mov ds, ax ; DS=0000H
mov ax, 3457h
mov bx, 0015h

;Addition
mov cx, ax ;-------> cx=3457h
add ax, bx
mov [4000h], ax

;Subtraction
mov ax, cx ;-------> ax=3457h
sub ax, bx ;-------> ax-bx
mov [4002h], ax

;Multiplication
mov ax, cx
mul bx     ;-------> ax * bx  and {stores upper 16-bit in DX and lower 16-bit in AX}
mov [4004h], ax
mov [4006h], dx

;Divition
mov dx, 0000h
mov ax, cx
div bx
mov [4008h], ax ;-------> quotient value
mov [400Ah], dx ;-------> remainder value

hlt