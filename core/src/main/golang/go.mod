module github.com/kr328/cfa

go 1.13

require (
	github.com/Dreamacro/clash v0.0.0 // local
	github.com/kr328/tun2socket v0.0.0-20200423032118-6f5116368120
	github.com/miekg/dns v1.1.29
)

replace github.com/Dreamacro/clash => ./clash
